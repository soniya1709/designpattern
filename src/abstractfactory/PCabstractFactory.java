package abstractfactory;

public class PCabstractFactory implements ComputerAbstractFactory{
	private String ram;
	private String hdd;
	private String cpu;
	
	@Override
	public String toString() {
		return "PCabstractFactory [ram=" + ram + ", hdd=" + hdd + ", cpu=" + cpu + "]";
	}

	public PCabstractFactory(String ram, String hdd, String cpu) {
		super();
		this.ram = ram;
		this.hdd = hdd;
		this.cpu = cpu;
	}

	@Override
	public Computer createComputer() {
		// TODO Auto-generated method stub
		return null;
	}

	
}
