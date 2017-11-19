package io.swagger.api;


import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-11-19T14:46:18.566Z")

@Api(value = "portfolio", description = "the portfolio API")
public interface PortfolioApi {

    @ApiOperation(value = "Динамика активов", notes = "Возвращает динамику активов ", response = Object.class, tags={ "assetsDynamic", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "search results matching criteria", response = Object.class),
        @ApiResponse(code = 400, message = "bad input parameter", response = Object.class) })
    @RequestMapping(value = "/portfolio/{id}/assetsDynamic/",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<Object> assetsDynamic(@ApiParam(value = "Идентификатор портфолио",required=true ) @PathVariable("id") String id);


    @ApiOperation(value = "Инструменты", notes = "Возвращает все финансовые инстурменты портфеля ", response = Object.class, tags={ "Instruments", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "search results matching criteria", response = Object.class),
        @ApiResponse(code = 400, message = "bad input parameter", response = Object.class) })
    @RequestMapping(value = "/portfolio/{id}/instruments/",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<Object> instruments(@ApiParam(value = "Идентификатор портфолио",required=true ) @PathVariable("id") String id);


    @ApiOperation(value = "Текущее состояние портфеля", notes = "Возвращает текущее состояние портфеля ", response = Object.class, tags={ "Portfolio", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "search results matching criteria", response = Object.class),
        @ApiResponse(code = 400, message = "bad input parameter", response = Object.class) })
    @RequestMapping(value = "/portfolio/{id}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<Object> portfolio(@ApiParam(value = "Идентификатор портфолио",required=true ) @PathVariable("id") String id);

}
