package chapterEight.covarianceOfReturnTypes;

/**
 * Created by Vladimir Glinskikh on 15.12.2017.
 * e-mail: vladimir.v.glinskikh@gmail.com
 */
public class WheatMill extends Mill {
    Wheat process() {
        return new Wheat();
    }
}
