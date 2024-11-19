import RunData.runDataAdapter
import androidx.recyclerview.widget.RecyclerView




  data class Run( val date : String, val distance: Double, val time : Double, val pace: Double)


class RunDataAdapter (private val runData: Array<Array<String>>) : RecyclerView.Adapter<RunDataAdapter.ViewHolder>()

  {

}

