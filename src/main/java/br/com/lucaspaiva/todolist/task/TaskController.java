package br.com.lucaspaiva.todolist.task;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.lucaspaiva.todolist.utils.Ultils;
import jakarta.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/tasks")

public class TaskController {

  @Autowired
  private ITaskRepository taskRepository;

  @PostMapping("/")
  public ResponseEntity create(@RequestBody TaskModel taskModel, HttpServletRequest request) {
    var idUser = request.getAttribute("idUser");
    taskModel.setIdUser((UUID) idUser);
    var currentDate = LocalDateTime.now();
    if (currentDate.isAfter(taskModel.getStartDate()) || currentDate.isAfter(taskModel.getEndDate())) {
      return ResponseEntity.status(HttpStatus.BAD_REQUEST)
          .body("A data de inicio / data de termino deve ser maior que a data atual");
    }
    if (taskModel.getStartDate().isAfter(taskModel.getEndDate())) {
      return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("A data de inicio  deve ser menor que a data termino");
    }
    var task = taskRepository.save(taskModel);
    return ResponseEntity.status(HttpStatus.OK).body(task);
  }

  @GetMapping("/")
  public List<TaskModel> list(HttpServletRequest request) {
    var idUser = request.getAttribute("idUser");
    var tasks = this.taskRepository.findByIdUser((UUID) idUser);
    return tasks;
  }

  // http://localhost:8080/tasks/1
  @PutMapping("/{id}")
  public ResponseEntity update(@RequestBody TaskModel taskModel, @PathVariable UUID id, HttpServletRequest request) {

    var task = this.taskRepository.findById(id).orElse(null);
    if (task == null) {
      return ResponseEntity.status(HttpStatus.BAD_REQUEST)
          .body("Tarefa não encontrada, verifique o id informado");
    }

    var idUser = request.getAttribute("idUser");

    if (!task.getIdUser().equals(idUser)) {
      return ResponseEntity.status(401).body("Permissao negada");
    }
    Ultils.copyNonNullProperties(taskModel, task);
    var taskUpdate = this.taskRepository.save(task);
    return ResponseEntity.ok().body(taskUpdate);

  }

}
