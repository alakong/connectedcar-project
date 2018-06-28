package first.common.frame;

import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Repository;

import first.common.dao.AbstractDAO;
import first.common.vo.Area;
import first.common.vo.CarState;
import first.common.vo.Danger;

@Repository("dangerDao")
public class DangerDao extends AbstractDAO {
	
	public void insert(Danger d) {
	}
	
	public void insert(CarState c) {
		insert("manage.insert",c);
	}

	public void delete(String id) {
	}

	public void update(Danger d) {
	}
	
	public void update(CarState c) {
		update("manage.update",c);
	}

	//select CarState by id
	public CarState select(String id) {
		return (CarState) selectOne("manage.select",id);
	}

	//�������� ��ü �ٻ̾Ƽ� ������ �������� ������
	@SuppressWarnings("unchecked")
	public List<Danger> select() {	
		return selectList("danger.selectall");
	}
	
	//���� ��ġ ������ ���� �����浵 �˾ƺ���
	public Area selectArea(Integer num) {
		return (Area) selectOne("danger.areacheck",num);
	}
	
	//���� ��ġ�� ��� ������ �ش��ϴ��� Ȯ���ϱ�
	public Integer select(HashMap<String, Object> map) {
		return (Integer)selectOne("danger.areanum",map);
	}
	
	//�ش� ������ 3ĭ ���� ������ ������
	@SuppressWarnings("unchecked")
	public List<Danger> selectone(HashMap<String, Object> map) {
		return  selectList("danger.selectone",map);
	}

	
	
}








