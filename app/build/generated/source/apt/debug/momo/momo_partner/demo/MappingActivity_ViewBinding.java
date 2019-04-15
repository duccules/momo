// Generated code from Butter Knife. Do not modify!
package momo.momo_partner.demo;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;

public class MappingActivity_ViewBinding implements Unbinder {
  private MappingActivity target;

  private View view2131427417;

  @UiThread
  public MappingActivity_ViewBinding(MappingActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public MappingActivity_ViewBinding(final MappingActivity target, View source) {
    this.target = target;

    View view;
    target.tvEnvironment = Utils.findRequiredViewAsType(source, R.id.tvEnvironment, "field 'tvEnvironment'", TextView.class);
    target.tvClientId = Utils.findRequiredViewAsType(source, R.id.tvClientId, "field 'tvClientId'", TextView.class);
    target.tvUsername = Utils.findRequiredViewAsType(source, R.id.tvUsername, "field 'tvUsername'", TextView.class);
    target.tvPartnerCode = Utils.findRequiredViewAsType(source, R.id.tvPartnerCode, "field 'tvPartnerCode'", TextView.class);
    target.tvMessage = Utils.findRequiredViewAsType(source, R.id.tvMessage, "field 'tvMessage'", TextView.class);
    view = Utils.findRequiredView(source, R.id.btnMappingMoMo, "field 'btnMappingMoMo' and method 'onViewClicked'");
    target.btnMappingMoMo = Utils.castView(view, R.id.btnMappingMoMo, "field 'btnMappingMoMo'", Button.class);
    view2131427417 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked();
      }
    });
  }

  @Override
  @CallSuper
  public void unbind() {
    MappingActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.tvEnvironment = null;
    target.tvClientId = null;
    target.tvUsername = null;
    target.tvPartnerCode = null;
    target.tvMessage = null;
    target.btnMappingMoMo = null;

    view2131427417.setOnClickListener(null);
    view2131427417 = null;
  }
}
