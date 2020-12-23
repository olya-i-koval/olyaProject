package ua.npu.edu.pattern.task04;

public class FigureFactory {
    public TetrisFigure getFigure (Integer figureType) {
        if (figureType == null)
            return null;
        TetrisFigure fig = null;
        switch (figureType) {

            case 1:
                fig = new ua.npu.edu.pattern.task04.figures.JFig();
                break;
            case 2:
                fig = new ua.npu.edu.pattern.task04.figures.LFig();
                break;
            case 3:
                fig = new ua.npu.edu.pattern.task04.figures.OFig();
                break;
            case 4:
                fig = new ua.npu.edu.pattern.task04.figures.ZFig();
                break;
        }
        return fig;
    }
}

