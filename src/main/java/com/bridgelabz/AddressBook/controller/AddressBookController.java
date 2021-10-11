package com.bridgelabz.AddressBook.controller;


import com.bridgelabz.AddressBook.dto.ContactDTO;
import com.bridgelabz.AddressBook.dto.ResponseDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class AddressBookController {

    @GetMapping({"", "/", "/get"})
    public ResponseEntity<ResponseDTO> getAllContact() {
        ResponseDTO respDto = new ResponseDTO("Get call Succeed", null);
        return new ResponseEntity<>(respDto, HttpStatus.OK);
    }

    @GetMapping("/get/{contactId}")
    public ResponseEntity<ResponseDTO> getContactById(@PathVariable int contactId) {
        ResponseDTO respDto = new ResponseDTO("Get call Succeed for id : " + contactId, null);
        return new ResponseEntity<>(respDto, HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<ResponseDTO> addContact(@RequestBody ContactDTO contactDTO) {
        ResponseDTO respDto = new ResponseDTO("Created Contact Data for : ", contactDTO);
        return new ResponseEntity<>(respDto, HttpStatus.OK);
    }

    @PutMapping("/update/{contactId}")
    public ResponseEntity<ResponseDTO> updateContact(@PathVariable int contactId, @RequestBody ContactDTO contactDTO) {
        ResponseDTO respDto = new ResponseDTO("Updated Contact Data for : " + contactId, contactDTO);
        return new ResponseEntity<>(respDto, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{contactId}")
    public ResponseEntity<ResponseDTO> deleteContact(@PathVariable int contactId) {
        ResponseDTO respDto = new ResponseDTO("Deleted Contact Data for : " + contactId, null);
        return new ResponseEntity<>(respDto, HttpStatus.OK);
    }

}
