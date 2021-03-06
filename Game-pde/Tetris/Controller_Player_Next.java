

public class Controller_Player_Next extends Controller_Abstract
{
    /**
     * Create controller.
     */
    public Controller_Player_Next(Controller_PlayerAbstract controller_player) {
        super(controller_player, null, null);
        this.view = new View_Player_Next(this, this.getParentController().getView());
    }

    public View_Player_Next getView() {
        return (View_Player_Next) super.getView();
    }

    public Controller_PlayerAbstract getParentController() {
        return (Controller_PlayerAbstract) super.getParentController();
    }

    /**
     * Get next tetromino.
     */
    public Model_Tetromino getNextTetromino() {
        return this.getParentController().getNextTetromino();
    }
}
