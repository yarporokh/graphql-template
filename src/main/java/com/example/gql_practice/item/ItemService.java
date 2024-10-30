package com.example.gql_practice.item;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ItemService {
    private final ItemRepository itemRepository;

    public List<Item> findAll() {
        return itemRepository.findAll();
    }

    public Item save(Item item) {
        return itemRepository.save(item);
    }

    public Item findById(Long id) {
        return itemRepository.findById(id).orElse(null);
    }

    public void deleteById(Long id) {
        itemRepository.deleteById(id);
    }
}
