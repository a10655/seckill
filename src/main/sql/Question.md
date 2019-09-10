#mac如何设置环境变量
    需要设置的位置为：/usr/local/mysql/bin，此处有 mysql 文件。
    1）在 terminal(终端) 里面执行 vim ~/.bash_profile 语句
        bogon:~ user$ vim ~/.bash_profile
    2）此时可以看到.bash_profile的文本内容，
        在最后面部分添加 export PATH=$PATH:/usr/local/mysql/bin，
        添加完成后，按esc键，然后输入:wq，进行保存退出。
        export PATH=$PATH:/usr/local/mysql/bin
    3）最后在命令行输入source ~/.bash_profile使得环境变量可以立即生效，当然你可以关闭 terminal 再重新打开也是可以的~
        bogon:~ user$ source ~/.bash_profile
        最后，你就可以通过mysql -uroot -p这段命令登录 MySQL 了，再输入密码----就是上面那一段字符串rrr34yAoM7)#。
        bogon:~ user$ mysql -uroot -p
#Q: mac mysql error You must reset your password using ALTER USER statement before executing this statement.
    安装完mysql 之后，登陆以后，不管运行任何命令，总是提示这个
    step 1: SET PASSWORD = PASSWORD('your new password');
    step 2: ALTER USER 'root'@'localhost' PASSWORD EXPIRE NEVER;
    step 3: flush privileges;
    
    完成以上三步退出再登，使用新设置的密码就行了，以上除了红色的自己修改成新密码外，其他原样输入即可
    参考1: https://dev.mysql.com/doc/refman/5.6/en/alter-user.html
    参考2: http://dev.mysql.com/doc/refman/5.7/en/password-expiration-policy.html
    参考3: http://stackoverflow.com/questions/33467337/reset-mysql-root-password-using-alter-user-statement-after-install-on-mac
