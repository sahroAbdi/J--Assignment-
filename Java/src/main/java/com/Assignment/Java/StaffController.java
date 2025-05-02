package com.Assignment.Java;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/staff")
public class StaffController {
    private final StaffService staffService;
    public StaffController(StaffService staffService) {
        this.staffService = staffService;

    }
    @GetMapping
    public List<Staff> getAllStaff() {
        return staffService.getAllStaff();
    }
    @GetMapping("/{id}")
    public ResponseEntity<Staff> getStaffById(@PathVariable Long id) {
        Staff staff = staffService.getStaffById(id);
        return staff != null ? ResponseEntity.ok(staff)
                : ResponseEntity.notFound().build();
    }
    @PostMapping
    public ResponseEntity<Staff> createStaff(@RequestBody Staff staff) {
        Staff crteated = staffService.createStaff(staff);
        return ResponseEntity.status(HttpStatus.CREATED).body(crteated);
    }
    @PutMapping("/{id}")
    public ResponseEntity<Staff> updateStaff(@PathVariable Long id, @RequestBody Staff staff) {
        Staff crteated = staffService.updateStaff(id, staff);
        return ResponseEntity.ok(crteated);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Staff> deleteStaff(@PathVariable Long id) {
        staffService.deleteStaff(id);
        return ResponseEntity.noContent().build();
    }




}

