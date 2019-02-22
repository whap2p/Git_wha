package zking.impl;

import com.zking.p2pSSM.model.Admin;
import com.zking.p2pSSM.service.impl.AdminService;
import com.zking.p2pSSM.utils.PageBean;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import zking.base.SpringJunitTest;

import java.util.List;


public class AdminServiceImplTest extends SpringJunitTest {
    @Autowired
    private AdminService adminService;

    @Test
    public void queryByUserName() {
        PageBean pageBean = new PageBean();
        pageBean.setRows(2);
        Admin admin = new Admin();
        List<Admin> list = adminService.queryAdminPager(admin, pageBean);
        System.out.println(list.size());
        for (Admin h : list) {
            System.out.println(h);
        }
    }
}