

public class Controller_PlayerHuman extends Controller_PlayerAbstract
{
    public static int counter = 0;
    protected int countedAs;
    protected Controller_PlayerHuman_Legend legendController;

    /**
     * Create controller.
     */
    public Controller_PlayerHuman(Controller_Tetris controller_tetris, Model_PlayerHuman model) throws Model_Exception {
        super(controller_tetris, model);
        this.legendController = new Controller_PlayerHuman_Legend(this);
        counter++;
        this.countedAs = counter;
    }

    public Model_PlayerHuman getModel() {
        return (Model_PlayerHuman) super.getModel();
    }

    public View_PlayerHuman getView() {
        return (View_PlayerHuman) super.getView();
    }

    public Controller_PlayerHuman_Grid getGridController() {
        return (Controller_PlayerHuman_Grid) super.getGridController();
    }

    /**
     * Get legend controller.
     */
    public Controller_PlayerHuman_Legend getLegendController() {
        return legendController;
    }

    public String getPlayerName() throws Model_Exception {
        String playerName = super.getPlayerName();
        if (playerName == null) {
            playerName = Controller_Tetris.translate("Human player") + (countedAs != 1 ? " " + countedAs : "");
        }
        return playerName;
    }
}
