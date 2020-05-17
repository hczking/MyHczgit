package cn.hcz.Controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Api(value = "SwaggerController是一个文档测试接口控制器")
@RestController
public class SwaggerController {
    @ApiImplicitParam(paramType = "query",name = "username",value = "用户编号",required = true, dataType = "Integer")
    @ApiOperation(value = "根据用户编号获取用户姓名",notes ="test: 仅1和2有正确返回" )
    @RequestMapping("/test")
    public String query(@RequestParam Integer userNumber){
        if(userNumber == 1){
            return "老马";
        }
        else if(userNumber == 2){
            return "慕容复";
        }
        else{
            return "未知";
        }

    }
}
