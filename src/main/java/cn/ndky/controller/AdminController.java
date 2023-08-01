package cn.ndky.controller;


import cn.ndky.config.Result;
import cn.ndky.service.AdminService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author yaacc
 * @since 2023-07-31
 */
@RestController

@Slf4j
@RequestMapping("/admin")
public class AdminController{
    @Autowired
    private AdminService adminService;


    //查找所有
    @GetMapping("/all")
    public Result<?> findAll() {
        return Result.success(adminService.list());
    }
    //按id查询
    @GetMapping("/{id}")

    public Result<?> getById(@PathVariable Integer id) {
        log.info("查询的id：{}", id);
        return Result.success(adminService.getById(id));
    }
    @DeleteMapping("/{id}")
    public Result<?> update(@PathVariable Integer id) {
        log.info("将被删除的id：{}", id);
        adminService.removeById(id);
        return Result.success();
    }
}

