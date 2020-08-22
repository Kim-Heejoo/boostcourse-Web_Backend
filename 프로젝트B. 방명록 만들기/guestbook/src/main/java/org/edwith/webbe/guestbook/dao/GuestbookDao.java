package org.edwith.webbe.guestbook.dao;

import org.edwith.webbe.guestbook.dto.Guestbook;
import org.edwith.webbe.guestbook.util.DBUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GuestbookDao {
	
    public List<Guestbook> getGuestbooks(){
        List<Guestbook> list = new ArrayList<>();

		String sql = "SELECT id, name, content, regdate FROM guestbook";
		try (Connection conn = DBUtil.getConnection();
				PreparedStatement ps = conn.prepareStatement(sql)) {
			
			try (ResultSet rs = ps.executeQuery()) {
				
				while (rs.next()) {
					Long id = rs.getLong(1);
					String name = rs.getString(2);
					String content = rs.getString(3);
					
					Date regdate = rs.getDate(4);
					
					Guestbook guestbook = new Guestbook(id, name, content, regdate);
					list.add(guestbook);
				}
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}

        return list;
    }

    public void addGuestbook(Guestbook guestbook){
		String sql = "INSERT INTO guestbook (name, content, regdate) VALUES ( ?, ?, now() )";
		try (Connection conn = DBUtil.getConnection();
				PreparedStatement ps = conn.prepareStatement(sql)) {

			ps.setString(1, guestbook.getName());
			ps.setString(2, guestbook.getContent());

			ps.executeUpdate();
            
		} catch (Exception ex) {
			ex.printStackTrace();
		}
    }
}
