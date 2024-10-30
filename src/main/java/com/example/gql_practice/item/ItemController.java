package com.example.gql_practice.item;

import lombok.RequiredArgsConstructor;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
//@RestController
@Controller
@RequestMapping("api/v1/item")
public class ItemController {
/*    private final ItemService itemService;

    @GetMapping
    public List<Item> getItems() {
        return itemService.findAll();
    }

    @GetMapping("{id}")
    public Item getItem(@PathVariable("id") Long id) {
        return itemService.findById(id);
    }

    @PostMapping
    public Item createItem(@RequestBody Item item) {
        return itemService.save(item);
    }

    @DeleteMapping("{id}")
    public void deleteItem(@PathVariable Long id) {
        itemService.deleteById(id);
    }*/
    //test cooment
    private final ItemService itemService;

    @QueryMapping
    public List<Item> findAll() {
        return itemService.findAll();
    }

    @QueryMapping
    public Item findById(@Argument Long id) {
        return itemService.findById(id);
    }

    @MutationMapping
    public Item create(@Argument Item item) {
        return itemService.save(item);
    }

    @MutationMapping
    public String delete(@Argument Long id) {
        itemService.deleteById(id);
        return "Deleted Item";
    }
}
