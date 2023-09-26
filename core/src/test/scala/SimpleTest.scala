import com.spotify.scio.testing.PipelineSpec
import org.junit.runner.RunWith
import org.scalatest.matchers.should.Matchers
import org.scalatestplus.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class SimpleTest extends PipelineSpec with Matchers {

  behavior of "Simple Pipeline"

  it should "" in runWithContext { sc =>
    val numbers = sc.parallelize(Seq(1, 2, 3))

    val multiples = numbers.map(_ * 2)

    multiples should containInAnyOrder(
      Seq(2, 4, 6)
    )
  }
}
