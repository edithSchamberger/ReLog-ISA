package ar.edu.undef.fie.api.Relog.error;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import org.springframework.http.HttpStatus;

import java.util.List;

@Data @Builder @AllArgsConstructor
public class ErrorResponse {

    private HttpStatus status;

    private String message;

    private List<String> errors;

}
