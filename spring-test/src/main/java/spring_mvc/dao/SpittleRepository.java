package spring_mvc.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import spring_mvc.entity.Spittle;

import java.util.List;

/*
 * @Author: cool
 * @Date: 2018/6/8 7:53
 */
@Repository
public interface SpittleRepository extends JpaRepository<Spittle, Long>{
    //List<Spittle> findSpittles(long max, int count);

}
