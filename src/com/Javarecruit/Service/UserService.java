package com.Javarecruit.Service;

import com.Javarecruit.pojo.Comment;
import com.Javarecruit.pojo.Show;
import com.Javarecruit.pojo.User;

import java.util.List;

public interface UserService {
    /**
     * 修改
     * @return 修改提示
     */
    int revise(User u);

    /**
     * 用户注册
     * @param user
     * @return
     */
    int enroll(User user);

    /**
     * 登录
     * @param uname 用户名
     * @param pwd 用户密码
     * @return
     */
    String login(String uname,String pwd);

    /**
     * 用户评论
     * @param c 评论对象
     * @return 评论成功失败
     */
    String addComment (Comment c);

    /**
     * 删除评论
     * @param commentid 评论编号
     * @return 删除成功失败
     */
    String deleteComment(int commentid);
    /**
     * 储存用户信息
     */
    public User sessionUser(String phone, String pwd);

    /**
     * 展示全部的方法
     * @return 展示结果
     */
    List<User> queryAll();
}
