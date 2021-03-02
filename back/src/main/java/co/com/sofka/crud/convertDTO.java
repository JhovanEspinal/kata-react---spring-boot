package co.com.sofka.crud;

import java.util.ArrayList;
import java.util.List;

public class convertDTO {

    public static TodoDTO changeTodo_TodoDTO(Todo todo){

       return new TodoDTO(todo.getId(), todo.getName(),todo.isCompleted(),todo.getGroupListId());

    }

    public static Todo changeTodoDTO_Todo(TodoDTO todoDTO){
        Todo todo = new Todo();

        todo.setId(todoDTO.getId());
        todo.setName(todoDTO.getName());
        todo.setCompleted(todoDTO.isCompleted());
        todo.setGroupListId(todoDTO.getGroupListId());

        return todo;

    }

    public static Iterable<TodoDTO> listTodoDTO(Iterable<Todo> listTodo){


        List<TodoDTO> listDTO = new ArrayList<>();

            for(Todo todo: listTodo){
                TodoDTO auxDTO = new TodoDTO();
                auxDTO.setId(todo.getId());
                auxDTO.setName(todo.getName());
                auxDTO.setCompleted(todo.isCompleted());
                auxDTO.setGroupListId(todo.getGroupListId());
                listDTO.add(auxDTO);
            }

            return listDTO;
        }

        public static boolean notSpace(String name){
            if(name.charAt(0) == ' '){
                return false;
            }
        return true;

        }

    }


