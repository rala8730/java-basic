package variable;
import static java.lang.System.out;


public class exercise {
	
	private int hr;
	private int day;
	private int yr;
	
	public 	exercise(){
		int hr=0;
		int day=0;
		int yr=0;
	}
	public void convmin(int min) {
		//60 min= 1hr
		//24 hr=1 day
		//365 days= 1 yr
		int hr=0;
		int day=0;
		int yr=0;
		while(min>60) {
			if(min<60) {
				//out.println(min +" minute");
			}
			else if(min>=60) {
				hr++;
				min=min-60;
			}
			
			if(hr<24) {
				//out.println(hr+" hour");
			}
			else if(hr>=24) {
				day++;
				hr=hr-24;
			}
			
			if(day<365) {
				//out.println(day+" year");
			}
			else if(day>=365){
				yr++;
				day=day-365;
			}
		}
		
		out.println(min+": minute "+ hr+": hour "+day+": day "+ yr+": year");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		exercise e= new exercise();
		e.convmin(527140);

	}

}
