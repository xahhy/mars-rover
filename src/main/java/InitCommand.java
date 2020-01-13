public class InitCommand extends Command {
    public InitCommand(String commandString) {
        super(commandString);
    }

    @Override
    public boolean isMatch() {
        try{
            new Location(this.command);
            return true;
        }catch (Exception e){
            return false;
        }
    }
}
