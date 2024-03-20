package fraco.modelo;
import java.util.Date;

public class EventoMelhorado {
		private String descricao;
		private Date data;
			

		public String getDescricao() {
			return descricao;
		}
			
		public Date getData() {
			return data;
		}
		
		public void  setDescricao(String str) {
			this.descricao = str;
		}
		
		public void setData(Date data) {
			this.data = data;
		}
	

}
