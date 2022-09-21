
abstract class Persosn {
		private String name;
		private String Gender;
		
		public Persosn (String nm, String gen ) {
			this.name=nm;
			this.Gender=gen;
		}
		abstract void work();
		
		public String toString() {
			return "Name "+this.name+" || Gender :"+this.Gender;
		}
		public void nameChange(String newName) {
			this.name=newName;
		}
}
