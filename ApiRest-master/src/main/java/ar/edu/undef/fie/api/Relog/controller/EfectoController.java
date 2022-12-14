package ar.edu.undef.fie.api.Relog.controller;

import ar.edu.undef.fie.api.Relog.service.EfectoService;
import ar.edu.undef.fie.api.Relog.model.request.EfectoRequest;
import ar.edu.undef.fie.api.Relog.model.response.EfectoResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/efecto")
public class EfectoController {

    @Autowired
    private EfectoService efectoService;

    @PostMapping
    public ResponseEntity<EfectoResponse> create(@Valid @RequestBody EfectoRequest request) {
        return ResponseEntity.status(HttpStatus.CREATED).body(efectoService.create(request));
    }

}
