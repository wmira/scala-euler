package euler

import org.junit.Test
import org.junit.Assert.assertEquals

/**
 * Created by miralabs on 10/6/2014.
 */
class Euler18Test {

  @Test def testTriNode() = {
    val leftNode = new TriNode(1,1,25,null,null)
    assertEquals(25,leftNode.computeMaxTotal)

    val rightNode = new TriNode(1,2,10,null,null)
    assertEquals(10,rightNode.computeMaxTotal)

    val triNode = new TriNode(0,1,5,leftNode,rightNode)
    assertEquals(30,triNode.computeMaxTotal)
  }

  @Test def euler18() = {
    val euler = new Euler18;
    assertEquals(1074,euler.solve)
  }
}
