package com.TechnoGrowth;


	
	public class StudGetSet
	{
		
		public static void main(String[] args) {
			StudGet s=new StudGet();
		
		s.SetRollNo(101);
	}
		public class StudGet {
			private int rn;
			private String name;
				
			public void SetRollNo(int rn) {
				this.rn=rn;
			}
		}

		

	}


