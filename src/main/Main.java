package main;

import services.*;

public class Main {

	public static void main(String[] args) {
		IProvider prov = new Provider();
		IBank bank = new Bank();
		IStore store = new Store(prov, bank);
		Client cl = new Client(store);
		
		cl.run();

	}

}
