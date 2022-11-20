import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
//import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestSLL {
	
	public SLL sll = new SLL();

	@BeforeEach
	void setUp() throws Exception {
	}
	
	@Test
    public void testHeadForNull() {
        assertNull(sll.head);
    }
    
    @Test
    public void testHeadForNode() {
        sll.add(8);
        assertNotNull(sll.head);
    }
    
    @Test
    public void testHeadNextVal() {
        sll.add(5);
        sll.add(10);
        sll.add(22);
        sll.removeFront();
        assertTrue(sll.head.value == 10);
    }
    
    @Test
    public void testHeadAfterRemove() {
        sll.add(10);
        sll.removeFront();
        assertNull(sll.head);
    }

}

