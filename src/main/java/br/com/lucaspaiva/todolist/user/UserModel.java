package br.com.lucaspaiva.todolist.user;

import java.time.LocalDateTime;
import java.util.UUID;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;


/*
 * @Data é uma anotação do lombok que gera automaticamente
 * 
 * @Getter apenas os getters
 * 
 * @Setters apenas os setters
 * a lib lombok é uma lib que gera getters e setters automaticamente
 * deixando o codigo mais limpo e facil de ler
 * 
 * public void setName(String name) {
 * this.name = name;
 * }
 * 
 * public String getName() {
 * return name;
 * }
 * 
 * public void setUsername(String username) {
 * this.username = username;
 * }
 * 
 * public String getUsername() {
 * return username;
 * }
 * 
 * public void setPassword(String password) {
 * this.password = password;
 * }
 * 
 * public String getPassword() {
 * return password;
 * }
 * ele automaticamente gera os getters e setters
 * 
 */
// chave primaria da tabela
@Data
@Entity(name = "tb_users")
public class UserModel {
    @Id
    @GeneratedValue(generator = "UUID")
    private UUID id;

    @Column(unique = true)
    private String username;
    private String name;
    private String password;

    @CreationTimestamp
    private LocalDateTime createdAt;
}
