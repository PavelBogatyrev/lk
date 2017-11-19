package io.swagger.api;


import io.swagger.annotations.*;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;


@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-11-19T14:46:18.566Z")

@Controller
public class PortfolioApiController implements PortfolioApi {

    public ResponseEntity<Object> assetsDynamic(@ApiParam(value = "Идентификатор портфолио",required=true ) @PathVariable("id") String id) {
        // do some magic!
        return new ResponseEntity<Object>(HttpStatus.OK);
    }

    public ResponseEntity<Object> instruments(@ApiParam(value = "Идентификатор портфолио",required=true ) @PathVariable("id") String id) {
        // do some magic!
        return new ResponseEntity<Object>(HttpStatus.OK);
    }

    public ResponseEntity<Object> portfolio(@ApiParam(value = "Идентификатор портфолио",required=true ) @PathVariable("id") String id) {
        // do some magic!
        return new ResponseEntity<Object>(HttpStatus.OK);
    }

}
