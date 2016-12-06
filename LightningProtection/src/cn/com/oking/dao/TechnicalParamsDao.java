package cn.com.oking.dao;

import org.springframework.stereotype.Repository;

import cn.com.oking.entity.TechnicalParams;

import com.bstek.dorado.hibernate.HibernateDao;

/**
 * 技术参数录入
 * @author 寻香
 *
 */
@Repository
public class TechnicalParamsDao extends HibernateDao<TechnicalParams, Long> {

}
