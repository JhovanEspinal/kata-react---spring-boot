package co.com.sofka.crud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TodoService {

    @Autowired
    private TodoRepository repository;

    public Iterable<TodoDTO> list(){
        return convertDTO.listTodoDTO(repository.findAll());
    }

    public TodoDTO save(TodoDTO todoDTO){
        Todo todo = repository.save(convertDTO.changeTodoDTO_Todo(todoDTO));
        return convertDTO.changeTodo_TodoDTO(todo);
    }

    public void delete(Long id){

        repository.deleteById(id);
    }

    public TodoDTO get(Long id)
    {
        return convertDTO.changeTodo_TodoDTO(repository.findById(id).orElseThrow());
    }

}
