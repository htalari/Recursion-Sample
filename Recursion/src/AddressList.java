/**
 * AddressList represents the Linked List of the program.
 * internal private class ListNode represents each node in the list
 * @author Talari
 * version 1.0
 */
public class AddressList {
	private ListNode head = null;
	private ListNode currentNode = null;
	int i = 0;
	String str = "";
	/**
	 * This nested, private class represents a node of a singly linked list.
	 */
	private class ListNode {
		private String name;
		private String tel; // Telephone number
		private String email;
		private String addr; // Address
		private String dob; // Date of birth
		private ListNode next; // Pointer to the next node

		private ListNode(String name, String tel, String email, String addr, String dob) {
			this.name = name;
			this.tel = tel;
			this.email = email;
			this.addr = addr;
			this.dob = dob;
		} // end of the constructor
		
		public String getName() {
			return name;
		}

		public String getTel() {
			return tel;
		}

		public String getEmail() {
			return email;
		}

		public String getAddr() {
			return addr;
		}

		public String getDob() {
			return dob;
		}

		public void setName(String name) {
			this.name = name;
		}

		public void setTel(String tel) {
			this.tel = tel;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public void setAddr(String addr) {
			this.addr = addr;
		}

		public void setDob(String dob) {
			this.dob = dob;
		}

		public ListNode getNext() {
			return next;
		}

		public void setNext(ListNode link) {
			next = link;
		}
		/**
		 * equals method which checks to see if one node equals another
		 * @param ln node being passed to check for equality 
		 * @return true or false depending on if they are equal or not 
		 */
		public boolean equals(ListNode ln) {
			return this.name.equals(ln.name) && this.addr.equals(ln.addr) && this.tel.equals(ln.tel) && this.email.equals(ln.email) && this.dob.equals(ln.dob);
		}
		/**
		 * toString method for any given node
		 */
		public String toString() {
			return this.name + " " + this.tel + " " + this.email + " " + this.addr + " " + this.dob + "\n";
		}
	} // end of class ListNode
// ======================================
	/**
	 * method that creates and adds a node to the front of the linked list 
	 * @param _name represends individuals name
	 * @param _tel represents individuals phone number
	 * @param _email represents individuals email address
	 * @param _address represents individuals address
	 * @param _dob represents individuals date of birth 
	 */
	public void addToFront(String _name, String _tel, String _email, String _address, String _dob) {
		ListNode node = new ListNode(_name, _tel, _email, _address, _dob);
		if(isEmpty()) {
			head = node;
		}
		else { 
			node.setNext(head);
			head = node;
		}
	}
	/**
	 * method which checks to see if the linked list is empty 
	 * @return true or false depending on if hte linked list is empty or not 
	 */
	public boolean isEmpty() {
		if(head == null) {
			return true;
		}
		else {
			return false;
		}
	}
	/**
	 * ToString method for the linked list, checks to see if list is empty if not then it calls
	 * helper method 
	 * @return returns string representation of entire linked list
	 */
	public String ToString() {
		if(isEmpty()) {
			String str = "There are no nodes";
			return str;
		}
		else {
			return recurseToString(head);
		}
	}
	/**
	 * method which recursively calls the tostring method for every node in the linked list until the end is reached. 
	 * @param ln node we are currently at 
	 * @return string representation of the linked list
	 */
	private String recurseToString(ListNode ln) {
		if (ln.getNext() == null) {
			return ln.toString();
		}
		else {
			return ln.toString() + "" + recurseToString(ln.getNext());
		}
	}
	/**
	 * method which adds a node to the back of a linked list. 
	 * @param _name represents individuals name
	 * @param _tel represents individuals phone number
	 * @param _email represents individuals email 
	 * @param _address represents individuals address
	 * @param _dob represents individuals date of birth 
	 */
	public void addToBack(String _name, String _tel, String _email, String _address, String _dob) {
		ListNode node = new ListNode(_name, _tel, _email, _address, _dob);
		if(isEmpty()) {
			node.setNext(null);
			head = node;
		}
		else {
			ListNode last = addToBackHelper(head);
			last.setNext(node);
			node.setNext(null);
		}
		
	}
	/**
	 * method which recursively calls itself untill we are at the back of the linked list. 
	 * @param ln represents the node we are currently at 
	 * @return returns the final node in the linked list
	 */
	private ListNode addToBackHelper(ListNode ln) {
		if(ln.getNext() == null) {
			return ln;
		}
		else {
			return addToBackHelper(ln.getNext());
		}
	}
	/**
	 * method which prints out the reverse of the entire linked list
	 * @return string representation of the linked list in reverse order. 
	 */
	public String reverseToString() {
		if(isEmpty()) {
			return "There are no nodes";
		}
		else {
			ListNode node = lastNode(head);
			return recurseReverseToString(node);
		}
	}
	/**
	 * private helper method which adds the current node we are at to the return and then calls a helper method
	 * unless we are at the head of the list
	 * @param ln represents where we are in the current linked list
	 * @return string representation of linked list in reverse as we parse through it
	 */
	private String recurseReverseToString(ListNode ln) {
		if(ln.equals(head)) {
			return ln.toString();
		}
		else {
			
			return ln.toString() + "" + recurseReverseToString(getPreviousNode(ln));
		}
	}
	/**
	 * grabes the node behind the one passed into the method
	 * @param ln reperesents the current node we are at 
	 * @return the node previous to the node we are at 
	 */
	private ListNode getPreviousNode(ListNode ln) {
		boolean flag = true;
		ListNode node = head;
		while(!(node.getNext().equals(ln))) {
				node = node.getNext();
			}
			return node;
		}
	/**
	 * private helper method which grabes the last node in the list 
	 * @param ln the node we are given to start at 
	 * @return the last node in the linked list
	 */
	private ListNode lastNode(ListNode ln) {
		while(ln.getNext() != null) {
			ln = ln.getNext();
		}
		return ln;
	}
	/**
	 * method that gives us the size of the linked list 
	 * @return represents the size of the List
	 */
	public int sizeOf() {
		int size = 0;
		if(isEmpty()) {
			return 0;
		}
		else {
			return recurseSizeOf(head, size);
		}
		
	}
	/**
	 * helper method which calls itself and increments size so of list untill end is reached
	 * @param ln current position of list 
	 * @param _size current size of list 
	 * @return size of list
	 */
	private int recurseSizeOf(ListNode ln, int _size) {
		if(ln.getNext() ==  null) {
			_size++;
			return _size;
			
		}
		else {
			_size++;
			return recurseSizeOf(ln.getNext(), _size);
			
		}
	}
	/**
	 * method which grabs the name of an individual and tries to find their phone number
	 * @param _name represents the name of user 
	 * @return the phone number 
	 */
	public String phoneNumberByName(String _name) {
		if(isEmpty()) {
			return "Not Listed";
		}
		else {
			return recursePhoneNumberByName(_name, head);
		}
	}
	/**
	 * private helper method which calls itself untill it finds the node which has the name of the paramater passed
	 * @param _name represents the name of the user 
	 * @param represents the current node we are at 
	 * @return the phone number of the user 
	 */
	private String recursePhoneNumberByName(String _name, ListNode ln ) {
		if(_name.equals(ln.getName())) {
			return ln.getTel();
		}
		else if(ln.getNext() == null) {
			return "Not Listed";
		}
		else {
			return recursePhoneNumberByName(_name, ln.getNext());
		}
	}
	/**
	 * method which grabs the users name and searches the linked list to find their email if hte name is valid
	 * @param _name represents users name
	 * @return email of user 
	 */
	public String emailByName(String _name) {
		if(isEmpty()) {
			return "Not Listed";
		}
		else {
			return recurseEmailByName(_name, head);
		}
	}
	/**
	 * private helper method that recursively goes through the linked list to find a matching name
	 * @param _name represents name of user 
	 * @param ln represents current node 
	 * @return email of user or "Not Listed" if name was not found 
	 */
	private String recurseEmailByName(String _name, ListNode ln) {
		if(_name.equals(ln.getName())) {
			return ln.getEmail();
		}
		else if(ln.getNext() == null) {
			return "Not Listed";
		}
		else {
			return recurseEmailByName(_name, ln.getNext());
		}
	}
	/**
	 * mehtod which grabs the users phone number and tries to find their name 
	 * @param _tel represents the users phone number
	 * @return users phone number or "Not Listed" if their number could not be found 
	 */
	public String nameByPhoneNumber(String _tel) {
		if(isEmpty()) {
			return "Not Listed";
		}
		else {
			return recurseNameByPhoneNumber(_tel, head);
		}
	}
	/**
	 * private helper method which recrusively calls itself untill a matching phone number is found or 
	 * the end of the list is reached 
	 * @param _tel represents the phone number of a user
	 * @param ln represents the current position in the list 
	 * @return name of user or "Not Listed" if no match was found 
	 */
	private String recurseNameByPhoneNumber(String _tel, ListNode ln) {
		if(_tel.equals(ln.getTel())) {
			return ln.getName();
		}
		else if(ln.getNext() == null) {
			return "Not Listed";
		}
		else {
			return recurseNameByPhoneNumber(_tel, ln.getNext());
		}
	}
	/**
	 * method which grabs the users name and tries to find their date of birth 
	 * @param _name represents users name 
	 * @return date of birth of user or "Not Listed" if list was empty 
	 */
	public String dobByName(String _name) {
		if(isEmpty()) {
			return "Not Listed";
		}
		else {
			return recurseDobByName(_name, head);
		}
	}
	/**
	 * private helper method which recrusively looks for a node with a matching name 
	 * @param _name represents users name 
	 * @param ln represents the current position in the Linked list we are in 
	 * @return the date of birth of a user or "Not Listed" if no match was found.
	 */
	private String recurseDobByName(String _name, ListNode ln) {
		if(_name.equals(ln.getName())) {
			return ln.getDob();
		}
		else if(ln.getNext() == null) {
			return "Not Listed";
		}
		else {
			return recurseDobByName(_name, ln.getNext());
		}
	}
	/**
	 * method which reverses the linked list itself
	 */
	public void reverse() {
		if(head != null && head.getNext() != null)
			recurseReverse(head.getNext());
	}
	/**
	 * private helper method that recursively swaps out nodes backwards to reverse the list
	 * @param ln represents the current node we are working with
	 */
	private void recurseReverse(ListNode ln) {
		if(ln.getNext() == null) {
			ListNode previous = this.getPreviousNode(ln);
			ln.setNext(head);
			head = ln;
			previous.setNext(null);
		}
		else {
			ListNode previous = this.getPreviousNode(ln);
			ListNode next = ln.getNext();
			ln.setNext(head);
			head = ln;
			previous.setNext(next);
			recurseReverse(next);
		}
	}
	
	
	
//======================================
} // end of class AddressList
