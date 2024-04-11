package kadai_010;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Scores_Chapter10 {

	public static void main(String[] args) {
		

		Connection con = null;
        Statement statement = null;

        try {
            // データベースに接続
            con = DriverManager.getConnection(
                "jdbc:mysql://localhost/challenge_java",
                "root",
                "Ami116208752"
            ); 
            
            System.out.println("データベース接続成功" + con.toString());

         // レコード更新用のSQLクエリを準備※要修正
            statement = con.createStatement();
            String sqlUpdate = "UPDATE score SET score_math = 95, score_english = 80 WHERE id = 5;";
         // レコードの更新を実行
            int rowCnt = statement.executeUpdate(sqlUpdate);
            System.out.println("レコード更新を実行します"  );
            System.out.println( rowCnt + "件のレコードが更新されました");
            
         // レコード並べ替え用のSQLクエリを準備
            Statement orderStatement = con.createStatement();
            String orderSql = "SELECT name, score_math, score_english FROM score ORDER BY score_math DESC, score_english DESC";
         // レコード並べかえを実行
            ResultSet resultSet = orderStatement.executeQuery(orderSql);
            System.out.println("数学・英語の点数が高い順に並べ替えました");
            
         // SQLクエリの実行結果を抽出
            while(resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                int scoreMath = resultSet.getInt("score_math");
                int scoreEnglish = resultSet.getInt("score_english");
                System.out.println(resultSet.getRow() + "件目：生徒id=" + id + "／氏名=" + name + "／数学=" + scoreMath + "／英語=" + scoreEnglish);
            }
             }
             
             catch(SQLException e) {
            System.out.println("エラー発生：" + e.getMessage());
        } finally {
            // 使用したオブジェクトを解放
            if( statement != null ) {
                try { statement.close(); } catch(SQLException ignore) {}
            }
            if( con != null ) {
                try { con.close(); } catch(SQLException ignore) {}
            }
            
        }
	}
}
	


//データベース接続成功：com.mysql.cj.jdbc.ConnectionImpl@xxxxxxxx
//レコード更新を実行します
//1件のレコードが更新されました
//数学・英語の点数が高い順に並べ替えました
//1件目：生徒ID=5／氏名=武者小路勇気／数学=95／英語=80
//2件目：生徒ID=2／氏名=刀沢彩香／数学=85／英語=70
//3件目：生徒ID=4／氏名=武士山美咲／数学=75／英語=95
//4件目：生徒ID=3／氏名=戦国広志／数学=75／英語=85
//5件目：生徒ID=1／氏名=侍健太／数学=65／英語=90