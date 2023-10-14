package br.com.lucaspaiva.todolist.task;

import java.time.LocalDateTime;
import java.util.UUID;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

/*
 id
  * usuario
  * descriçao
  * data de inicio 
  * data de fim
  * prioridade
  */
@Data
@Entity(name = "tb_tasks")
public class TaskModel {


  @Id
  @GeneratedValue(generator = "UUID")
  private UUID id;
  private String description;

  @Column(length = 50)
  private String title;
  private LocalDateTime startDate;
  private LocalDateTime endDate;
  private String priority;
  private UUID idUser;

  @CreationTimestamp
  private LocalDateTime createdAt;

  public void setTitle(String title) throws Exception{
    if(title.length() > 50){
        throw new Exception("O campo title deve conter no maximo 50 caracteres");
    }

    this.title = title;
}
}
