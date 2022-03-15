package liu.mapper.pojo;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        try {
            InputStream config = Resources.getResourceAsStream("mybatis-config.xml");
            SqlSessionFactory ssf = new SqlSessionFactoryBuilder().build(config);
            SqlSession session = ssf.openSession();
//            List<User> list = session.selectList("UserMapper.SelectAllUser");
            // executor 执行器?
            User Minho = new User(434, "liuyang","19计科3");
            try {
                session.insert("UserMapper.InsertUser", Minho);
            }catch (Exception e){};
            session.delete("UserMapper.DeleteUser", 5);  //
            session.commit();
//            for(User user : list)
//            {
//                System.out.println(user.toString());
//            }


        } catch (IOException e) {
            e.printStackTrace();
        }


    }

}
