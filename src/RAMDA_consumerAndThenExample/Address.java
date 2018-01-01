package RAMDA_consumerAndThenExample;

public abstract class Address {
		private String country;
		private String city;
		
		public Address(String country, String city) {
			// TODO Auto-generated constructor stub
			this.country = country;
			this.city = city;
		}

		public String getCountry() {
			return country;
		}

		public String getCity() {
			return city;
		}
		
		
}
