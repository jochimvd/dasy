package xyz.vandijck.safety.backend.controller.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.UNAUTHORIZED)
public class UnauthorizedException extends RuntimeException {
    private static final long serialVersionUID = 2638287261392986674L;

    public UnauthorizedException(String msg) {
        super(msg);
    }

    public UnauthorizedException() { }
}
