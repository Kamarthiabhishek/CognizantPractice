import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Main {
	public static void main(String[] args) {
		try {
			Connection con = DB.getConectoin();
			String sql = "insert into flight values(?,?,?,?,?)";
			
			
			PreparedStatement preparedStatement = con.prepareStatement(sql);
			preparedStatement.setInt(1, flight.getFlightId());
			preparedStatement.setString(2, flight.getFlightName());
			preparedStatement.setDouble(3,  idwjaidjiaj());
			;
			;
			;
			;
			;
			;
			;
			
			preparedStatement.execute();
			return true;
		}catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
