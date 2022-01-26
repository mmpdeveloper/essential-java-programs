import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class MemModelStarter {

	public static void main(String[] args) {
		WidgetViewer wv = new WidgetViewer();
		
		JTextField j0 = new JTextField("Change Me");
		JButton pushMe = new JButton("push me");
		wv.add(j0); //, 10, 30, 100, 20);
		
		// do only one of the following
		wv.addAndWait(pushMe);
		// wv.addButtonAndWait("push me");

		String j0Text = j0.getText();
		
		JTextField j1 = new JTextField(j0Text);
		
		
		JTextField j2; 
		j2 = j1;
		j2.setText("jack");
		
		wv.add(j1);
	}

}

/*


 
JTextField j0 = new JTextField("Change Me"); 
in the heap we create a JTextField object this new 
object causes this operator to be created and returns a memory 
address to it, copies the memory address to the main bit of 
memory associated with j0. It is here where the text displayed 
to the user is being stored 

JTextField j2; //declare j2, no new objects created 
in the heap. its not pointing to anything but what we do have is
an assignment. this is a named bit of memory but its not
pointing to anything. 


j2 = j1; j2 is assigned to j1, the assignment operator works in two 
steps, the first is to evaluate to the right of the equal sign which 
is the pointer j1.
then we take what (JTextField j1 = new JTextField(j0Text);) 
what j1 evaluates down to and then we copy it over to the memory 
associated with the one and only thing that can be to the left of the
equal sign. So this assignment is going to take that value and 
copy it down here, the effect of which is going to make j2 point to the
same object as j1. when two references reference the same object, 
we call those references an alias so these two 
JTextField j1; and JTextField j2; j1 and j2 are said
to be aliases. 

so there is a method called set text. its the analog or the reverse of the get
text method j0.getText(). It lets us set the label here in the JTextField so 
if i do j2 set text(jack) 

Summary:

j0 references the object change me
the user changes that value to Sophie
we then create another jTextField and its a reference to the new
value Sophie
New is how objects are created in the heap, if there is no new, there 
is no new object in the heap
j1 was created with Sophie. Then j2 was declared but a new object wasnt
created, instead j2 was assigned to j1 
now j2 is pointing to the same object that j1 is pointing to and
j1 and j2 are now an alias.

j2.setText("jack"); how does setText work? it is going to replace 
Sophie with jack. 

but whats going to happen when you add j1 to wv.add(j1):
it displays jack as sophie has been replaced in this object by the j2
alias going the setText.

JTextField j0 points to the real data which is separate over to the heap and 
we can assign different references to point to the same object. we have to be 
careful to understand what these references are pointing to.
*/

