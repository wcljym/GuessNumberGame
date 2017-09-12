package com.tast;

import java.util.Random;
import java.util.Scanner;

public class RememberNum {
	static int max=100;//范围的最大值
	static int min=1;//最小值
	static int showTime=1;//一个数字出现的时间
	static int num=5;//全部数字
	static int showalltime=1;//全部是数字闪的时间
	static int shouwallnum=5;
	
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) throws InterruptedException {

		
		jindutiao();
		zhujiemian();
		DengLu();
		caidan();
		

	}
	
	
	public static void jindutiao() throws InterruptedException
	{
     for (int i = 0; i < 60; i++)
     {
    	 if(i%5==0)
    	 {
    	 Thread.sleep(50);
    	 System.out.print(">>>");
    	 }
    	 else
    	 {
    		 Thread.sleep(i*2);
    		 System.out.print(">>");
    	 }

	 }
	}
			public static void zhujiemian()
			{
				System.out.println( );
				System.out.println("             ◢████████████◣");
				System.out.println("     ██████████████████████████");
				System.out.println("     ██　　　        ◥██◤　　　██");
				System.out.println("◢███　　                 ◥◤　　　　██◣                 ╭────────────╮");
				System.out.println("▊▎██◣　　　　　　　            ◢█▊▊                                       │和我                           │");
				System.out.println("▊▎██◤　                  ●　●　　   ◥█▊▊                                     ╱       一起来玩             │"); 
				System.out.println("▊　██　　　　　　　　　　           █▊▊                                      ╲            记数字游戏  │");
				System.out.println("◥▇██　             ▊　　　　▊　    █▇◤                                        │                           吧！│");
				System.out.println("　　██　                 ◥▆▄▄▆◤　    █▊　　　◢▇▇◣           ╰───────╯");
				System.out.println("◢██◥◥▆▅▄▂▂▂▂▄▅▆███◣　   ▊◢　█");
				System.out.println("█╳　　　　　　　　　　　　　　　╳█　  ◥◤◢◤");
				System.out.println("◥█◣　　　˙　　　　　˙　　　    ◢█◤　  　◢◤");
				System.out.println("　　▊　　　　　　　　　　　　　▊　　　 　█"); 
				System.out.println("　　▊　　　　　　　　　　　　　▊　　　◢◤");
				System.out.println("　　▊　　　　　　⊕　　　　　　█▇▇▇◤" );
				System.out.println("   ◢█▇▆▆▆▅▅▅▅▆▆▆▇█◣");
				System.out.println("　       ▊　▂　▊　　　　　　▊　▂　");
			}
			public static void caidan() throws InterruptedException
			{
				int []arryNum=new int[100];
				int []ipoutNum=new int[100];
				while(true){
					System.out.println("\t\t\t\t\t\t\t\t\t╭╯☆★☆★╭╯");
					System.out.println("\t\t\t\t\t\t\t\t\t╰╮★☆★╭╯");
					System.out.println("\t\t\t\t\t\t\t\t\t│☆╭─╯");
					System.out.println("\t\t\t\t\t\t\t\t\t╭ ╭╯");
					System.out.println("\t\t\t\t\t\t\t\t\t　╔╝★╚╗  ①开始游戏    ❷游戏设置    ❸ 游戏帮助   ④退出游戏");
					System.out.println("\t\t\t\t\t\t\t\t\t║★☆★║╔═══╗　 ╔═══════╗　╔═══════╗  ╔═══════╗");
					System.out.println("\t\t\t\t\t\t\t\t\t║☆★☆║║★　☆║　║★　☆║　║★　☆║     ║★　☆║");
					System.out.println("\t\t\t\t\t\t\t\t\t◎══◎╚╝◎═◎╝═╚◎═◎╝═╚◎═◎╝═╚◎═◎╝..........");
					System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n");
					
					
					Thread.sleep(500);
					//System.out.println("\t\t\t\t\t\t╭╯☆★☆★╭╯");
					System.out.println("\t\t\t\t\t\t╰╮★☆★╭╯");
					System.out.println("\t\t\t\t\t\t│☆╭─╯");
					System.out.println("\t\t\t\t\t\tt╭ ╭╯");
					System.out.println("\t\t\t\t\t\t　╔╝★╚╗  ①开始游戏    ❷游戏设置    ❸ 游戏帮助   ④退出游戏");
					System.out.println("\t\t\t\t\t\t║★☆★║╔═══╗　 ╔═══════╗　╔═══════╗  ╔═══════╗");
					System.out.println("\t\t\t\t\t\t║☆★☆║║★　☆║　║★　☆║　║★　☆║     ║★　☆║");
					System.out.println("\t\t\t\t\t\t◎══◎╚╝◎═◎╝═╚◎═◎╝═╚◎═◎╝═╚◎═◎╝..........");
					System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n"
							+ "\n\n");
					
					
					Thread.sleep(500);
					//System.out.println("\t\t\t╭╯☆★☆★╭╯");
					System.out.println("\t\t\t╰╮★☆★╭╯");
					System.out.println("\t\t\t│☆╭─╯");
					System.out.println("\t\t\t╭ ╭╯");
					System.out.println("\t\t\t　╔╝★╚╗  ①开始游戏    ❷游戏设置    ❸ 游戏帮助   ④退出游戏");
					System.out.println("\t\t\t║★☆★║╔═══╗　 ╔═══════╗　╔═══════╗  ╔═══════╗");
					System.out.println("\t\t\t║☆★☆║║★　☆║　║★　☆║　║★　☆║     ║★　☆║");
					System.out.println("\t\t\t◎══◎╚╝◎═◎╝═╚◎═◎╝═╚◎═◎╝═╚◎═◎╝..........");
					System.out.println("\n\n\n\n\n\n\n\n\r\r\r\r\r");
					
					Thread.sleep(500);
					//System.out.println("╭╯☆★☆★╭╯");
					System.out.println("╰╮★☆★╭╯");
					System.out.println("│☆╭─╯");
					System.out.println("╭ ╭╯");
					System.out.println("╔╝★╚╗  ①开始游戏    游戏设置    ❸ 游戏帮助   ④退出游戏");
					System.out.println("║★☆★║╔═══╗　 ╔═══════╗　╔═══════╗  ╔═══════╗");
					System.out.println("║☆★☆║║★　☆║　║★　☆║　║★　☆║     ║★　☆║");
					System.out.println("◎══◎╚╝◎═◎╝═╚◎═◎╝═╚◎═◎╝═╚◎═◎╝..........");
					System.out.println("\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r");

				  System.out.println("请输入你的选择");
				  int choose=sc.nextInt();
				  switch (choose) {
				  	case 1:
				  		Play( arryNum, ipoutNum, num);
					break;
					case 2:
						GameSet();
						break;
					case 3:
						Help();
						break;
					case 4:
						exit();
						break;
					default:
					System.out.println("输入有错，请重新输入");
					break;
				}
		
				}
			}
			//生成随机数组
			public static void GetRandomnum(int [] array,int n) throws InterruptedException{
				Random rand=new Random();
				for (int i = 0; i < array.length; i++) {
					 array[i]=rand.nextInt(max-min+1)+min;
				}
				for (int i = 0; i <num; i++) {
					System.out.println("\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r");
				for (int j = 0; j < i; j++) {
					System.out.print("     ");
				
				}
				
				System.out.print(array[i]+" ");
				Thread.sleep(showTime*1000);
			}
			for (int i = 0; i <shouwallnum ; i++) {
				System.out.println("\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r");
			
					if(i%2==0)
					{
					System.out.print("   ");
					}
					else if(i%2==1){
						System.out.println("");
					}
				
				for (int j = 0; j < num; j++) {
					System.out.print(array[j]+" ");
				}
					Thread.sleep(showalltime*1000);
				}	
		
			}
			//获取从键盘接受记的数字
			public static void inputNum(int confirmArray[], int n){
				System.out.println("\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r");
				System.out.println("请按顺序输入你记得数字，共有"+n+"个");
				for (int i = 0; i < n; i++) 
				{
					 confirmArray[i]=sc.nextInt();
				}
			}
			public static int comparNum(int array[],int confirArray[] ){
				int count=0;
				for (int i = 0; i < confirArray.length; i++) {
					if(array[i]== confirArray[i]){
						count++;
					}
				}
				return count;
			}
			public static void showresult(int remember,int array[]) throws InterruptedException
			{
				if(remember==0){
					Thread.sleep(800);
					System.out.println("你是猪啊，一个都没记住");
				}
				
				else if(remember==num)
					System.out.println("真聪明，全都记住了");
			
				else{
					System.out.println("你记住了"+remember+"个，还有"+(num-remember)+"个没记住，再接再厉啊");
				     }
				
				System.out.println("答案是：");
				for (int i = 0; i < num; i++) {
					System.out.print(array[i]+" ");
					
				}
				Thread.sleep(2000);
				}
			//核心代码
			public static void Play(int array[],int confirArray[],int num) throws InterruptedException
			{
		
		 	      GetRandomnum(array,num);
		 	      inputNum(confirArray,num);
		 	      int right=comparNum(array,confirArray);
		 	      showresult(right,array);
			}
			
			//游戏设置方法
			public static void GameSet(){
				{
				
				while(true){
				System.out.println("\t\t\t┏━━━━━━━━━━━━━━┓");
				System.out.println("\t\t\t┃1--设置数字间闪现的时间            ┃ ");
				System.out.println("\t\t\t┃2--设置全部数字间闪现的时间  ┃");
				System.out.println("\t\t\t┃3--设置出现数字的个数                 ┃");
				System.out.println("\t\t\t┃4--设置全部数字出现的次数       ┃");
				System.out.println("\t\t\t┃5--设置范围的最大值最小值       ┃");
				System.out.println("\t\t\t┃0--退出设置                                          ┃");
				System.out.println("\t\t\t┗━━━━━━━━━━━━━━┛");
				int choise=sc.nextInt();
					switch (choise) {
					case 1:
						System.out.println("请输入数字间闪现的时间");
						showTime=sc.nextInt();
						System.out.println("设置成功");
						break;
					case 2:
						System.out.println("请输入全部数字闪现的时间");	
						showalltime=sc.nextInt();
						System.out.println("设置成功");
						break;
					case 3:
						System.out.println("请输入出现数字的个数");
						 num=sc.nextInt();
						System.out.println("设置成功");
						break;
					case 4:
						System.out.println("请输入全部数字出现的次数");
						shouwallnum=sc.nextInt();
						System.out.println("设置成功");
						break;
					case 5:
						while(true){
						System.out.println("请输入范围的最大值");
						 max=sc.nextInt();
						System.out.println("请输入范围的最小值");
						min=sc.nextInt();
						if(min>max){
							System.out.println("输入有误，最小值不能小于最大值");
						}
						else{
						System.out.println("设置成功");
						  break;
						} 
					}
						break;
					case 0:
						
						return;
					}
			
				}
				}	
			}
			//游戏帮助方法
			public static void Help(){
				System.out.println("请输入你的选择");
				System.out.println("\t\t--1.关于游戏");
				System.out.println("\t\t--2.游戏信息");
				int choise=sc.nextInt();
				switch (choise) {
				case 1:
					
					break;
				case 2:
					System.out.println("***游戏开发者：王成龙****");
					System.out.println("*******版本号： 1.0.1****");
					System.out.println("*****开发日期： 2016.12.16");
					break;
				}
			}
			//游戏退出方法
            public static void exit(){
            	System.out.println("是否确定退出游戏？退出游戏请按g或者按任意键继续游戏");
            	char choise=sc.next().charAt(0);
            	if(choise=='g'||choise=='G')
            	{
            		System.exit(0);
     
            	}
            	}
            //游戏登录方法
			public static void DengLu() throws InterruptedException{
				while(true){
				String user="admin";
				String pew="12345";
				System.out.print("请输入你的用户名："+" ");
				String user1=sc.next();
				System.out.print("请输入你的密码："+"  ");
				
				String psw1=sc.next();
				if(user.equals(user1)&& pew.equals(psw1))
				{
					caidan();
					}
					else{
						System.out.println("密码或用户名不对，请重新输入");
					}
					
				}
				
			}
				
			}
	
	

//}
