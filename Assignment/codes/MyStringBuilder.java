package Questions;
public class MyStringBuilder {
	private char[] string;
	private int length;
	
	public MyStringBuilder() {
		super();
		this.string = new char[20];
		this.length=0;
	}
	public char[] getString() {
		return string;
	}
	public void setString(String string) {
		this.string = string.toCharArray();
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	@Override
	public String toString() {
		return new String(string,0,length);
	}
	public void append(String word)
	{
		ensuringCapacity(word);
		int l=getLength();
		for(int i=0;i<word.length();i++)
		{
			this.string[l++]=word.charAt(i);
		}
		setLength(l);
	}
	public void insert(int index,String word)
	{
		if(index>=0&&index<this.length)
		{
			setLength(this.length);
			int l=getLength();
			ensuringCapacity(word);
			int k=word.length();
			for(int i=(index+k-1),j=(index-1),a=0;a<k;a++,i++,j++)
			{
				string[i]=string[j];
			}
			for(int j=0;j<k;j++)
			{
				string[index-1]=word.charAt(j);
				index++;
			}
			setLength(l+k);
			
		}
		else
		{
			System.out.println("Return is not possible");
		}
	}
	public void delete(int startIndex,int LastIndex)
	{
		int l=LastIndex-startIndex;
		for(int i=LastIndex,j=startIndex;i<getLength();i++,j++)
		{
			string[j]=string[i];
		}
		setLength(getLength()-l);
	}
	public void ensuringCapacity(String word)
	{
		int capacity=this.string.length;
		int r=getLength()+word.length();
		if(r>capacity)
		{
			capacity=(this.getLength()+word.length());
			char[] newChar=new char[capacity];
			System.arraycopy(string,0,newChar,0,getLength());
			string=newChar;
		}
		
	}
	
	

}