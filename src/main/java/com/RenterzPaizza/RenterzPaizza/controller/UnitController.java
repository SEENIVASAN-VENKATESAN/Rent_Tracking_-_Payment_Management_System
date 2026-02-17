package com.RenterzPaizza.RenterzPaizza.controller;

import com.RenterzPaizza.RenterzPaizza.entity.Unit;
import com.RenterzPaizza.RenterzPaizza.service.UnitService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/unit")

public class UnitController {

    @Autowired
    UnitService unitService;

//    // CREATE
//    @PostMapping
//    public ResponseEntity<Unit> create(@RequestBody Unit unit) {
//        return ResponseEntity.ok(unitService.create(unit));
//    }
//
//    // GET ALL
//    @GetMapping
//    public ResponseEntity<List<Unit>> getAll() {
//        return ResponseEntity.ok(unitService.getAll());
//    }
//
//    // GET BY ID
//    @GetMapping("/{id}")
//    public ResponseEntity<Unit> getById(@PathVariable Long id) {
//        return ResponseEntity.ok(unitService.getById(id));
//    }
//
//    // UPDATE
//    @PutMapping("/{id}")
//    public ResponseEntity<Unit> update(
//            @PathVariable Long id,
//            @RequestBody Unit unit) {
//
//        return ResponseEntity.ok(unitService.update(id, unit));
//    }
//
//    // DELETE
//    @DeleteMapping("/{id}")
//    public ResponseEntity<String> delete(@PathVariable Long id) {
//        unitService.delete(id);
//        return ResponseEntity.ok("Unit deleted");
//    }
}
