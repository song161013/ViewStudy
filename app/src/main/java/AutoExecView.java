import android.annotation.TargetApi;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.Nullable;

public class AutoExecView extends View {
    public AutoExecView(Context context) {
        super(context);
    }

    public AutoExecView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public AutoExecView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @TargetApi(21)
    public AutoExecView(Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }
}
