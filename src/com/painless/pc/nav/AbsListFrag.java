package com.painless.pc.nav;

import android.app.ListFragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.painless.pc.R;
import com.painless.pc.util.PathDrawable;

public class AbsListFrag extends ListFragment {

  private static final String PATH_DROID = "M109.5 28.3c-6.8 6.8-10.2 15.1-10.2 24.8s3.4 17.9 10.2 24.8 15.1 10.2 24.8 10.2 17.9-3.4 24.8-10.2 10.2-15.1 10.2-24.8-3.4-17.9-10.2-24.8-15.1-10.2-24.8-10.2-18 3.4-24.8 10.2m40.5 13.7c.9 1.2 1.6 2.5 2.2 3.8l5.8-.1c.8 2.4 1.2 4.9 1.3 7.2l-5.6 1.7v.1c-.1 1.5-.4 2.9-.9 4.3l4.6 3.7c-.3.6-.6 1.3-1 1.9-.8 1.6-1.7 3-2.8 4.4l-5.2-2.1h-.1c-1 1-2.2 1.9-3.6 2.8h.1l1.2 5.6c-1.3.7-2.6 1.2-4.1 1.6-.9.3-1.9.6-2.9.9l-2.6-5.1h-.1c-1.5.1-2.9.1-4.4-.1l-.1.1-2.8 5.1c-2-.5-4.1-1.2-6.1-2.2-.2-.1-.5-.3-.8-.4l1.2-5.5v-.1c-1.2-.8-2.3-1.8-3.4-2.9v.1l-5.4 2.1c-1.5-1.9-2.7-4-3.6-6.4l4.5-3.5v-.1c-.3-1.4-.5-2.8-.6-4.4l-5.6-1.8c.1-2.4.6-4.9 1.4-7.2l5.7.2c.6-1.2 1.3-2.5 2.3-3.8l-.1-.1-2.9-4.9c1.6-1.8 3.5-3.4 5.6-4.6l4.2 3.8.1-.1c1.3-.6 2.8-1 4.3-1.4l-.1-.1.9-5.8c2.5-.3 5-.3 7.4.1l.7 5.8c1.5.3 2.9.8 4.2 1.6l4.4-3.8c2.1 1.3 4 2.9 5.6 4.7l-2.9 4.9m-11.3 2.8c-2.4-1.2-4.9-1.4-7.4-.6-2.6.9-4.5 2.5-5.7 4.8-1.2 2.4-1.4 4.8-.5 7.4.9 2.6 2.5 4.5 4.9 5.6 2.4 1.2 4.8 1.4 7.4.6 2.5-.8 4.4-2.4 5.6-4.8 1.2-2.4 1.4-4.9.6-7.4-1-2.5-2.6-4.4-4.9-5.6m49.9-58.4c-1.4-1.4-3-2-4.9-2-2 0-3.6.7-5 2-1.4 1.4-2 3-2 4.9-.1 1.9.6 3.6 2 4.9l19.8 19.8c1.4 1.4 3.1 2.1 5.1 2.1h21.2c1.9 0 3.6-.7 4.9-2.1s2.1-3 2.1-4.9c0-1.9-.7-3.6-2.1-4.9-1.4-1.4-3-2.1-4.9-2.1h-18.4l-17.8-17.7m13.1 11.7l4.9-4.9-42.4-42.4-28.2 28.2c-4.7 4.7-4.8 9.5-.1 14.2l40.9 40.8v17c0 2.8 1 5.1 2.9 7.1 2 2 4.3 2.9 7.1 2.9s5.1-1 7-2.9c2-1.9 3-4.3 3-7.1v-21.2c0-2.8-1-5.1-3-7.1l-8.3-8.3 5-4.9-12.5-12.5c-1.6-1.6-2.3-3.4-2.2-5.6v-.1c-.1-2.2.7-4.1 2.2-5.7 1.6-1.6 3.5-2.4 5.8-2.3h.1c2.1 0 3.9.8 5.5 2.3l12.3 12.5m16.6-29c0-7.9-2.7-14.8-8.1-20.5l7.8-7.9c.2-.2.3-.4.3-.7 0-.3-.1-.5-.3-.7-.2-.2-.4-.3-.7-.3-.3 0-.5.1-.7.3l-7.8 7.9c-5.7-5.4-12.5-8.2-20.5-8.2-8.3 0-15.3 2.9-21.2 8.8l42.4 42.4c5.9-5.8 8.8-12.8 8.8-21.1m-8.5-3.1c.6.6.9 1.3.9 2.1s-.3 1.5-.9 2.1c-.6.6-1.3.9-2.1.9s-1.5-.3-2.1-.9-.9-1.3-.9-2.1.2-1.5.8-2.2 1.3-.9 2.2-.8c.8 0 1.5.3 2.1.9m71 87.1c0-9.7-3.4-17.9-10.2-24.8-6.8-6.8-15.1-10.2-24.8-10.2s-17.9 3.4-24.8 10.2c-6.8 6.8-10.2 15.1-10.2 24.8s3.4 17.9 10.2 24.8c6.8 6.8 15.1 10.2 24.8 10.2s17.9-3.4 24.8-10.2 10.2-15.1 10.2-24.8m-30.4-18.5c1.5.3 2.9.8 4.2 1.6l4.4-3.8c2.1 1.3 4 2.9 5.6 4.7l-3 4.9c.9 1.2 1.6 2.5 2.2 3.8l5.8-.1c.8 2.4 1.2 4.9 1.3 7.2l-5.5 1.7v.1c-.1 1.5-.4 2.9-.9 4.3l4.6 3.7-.9 1.9c-.8 1.6-1.7 3-2.8 4.4l-5.2-2.1h-.1c-1 1-2.2 1.9-3.5 2.8l1.2 5.6c-1.3.7-2.6 1.2-4.1 1.6-.9.3-1.9.6-2.9.9l-2.6-5.1h-.1c-1.5.1-2.9.1-4.4-.1l-.1.1-2.8 5.1c-2-.5-4.1-1.2-6.1-2.2-.2-.1-.5-.3-.8-.4l1.1-5.5.1-.1c-1.2-.8-2.3-1.8-3.4-2.9v.1l-5.4 2.1c-1.5-1.9-2.7-4-3.6-6.4l4.4-3.5v-.1c-.3-1.4-.5-2.8-.6-4.4l-5.6-1.8c.1-2.4.6-4.9 1.4-7.2l5.7.2c.6-1.2 1.4-2.5 2.4-3.8l-.1-.1-2.9-4.9c1.6-1.8 3.5-3.4 5.6-4.6l4 3.7.1-.1c1.3-.6 2.8-1 4.3-1.4l-.1-.1.9-5.8c2.5-.3 5-.3 7.4.1l.8 5.9m4.5 15.8c-.9-2.5-2.5-4.4-4.8-5.6-2.4-1.2-4.9-1.4-7.4-.6-2.6.9-4.5 2.5-5.7 4.8-1.2 2.4-1.4 4.8-.6 7.4.9 2.6 2.5 4.5 4.9 5.6 2.4 1.2 4.8 1.4 7.4.6 2.5-.8 4.4-2.4 5.6-4.8 1.3-2.4 1.5-4.9.6-7.4z";

  @Override
  public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
    return inflater.inflate(R.layout.list_frag, container, false);
  }

  public void setEmptyMsg(int title, int msg) {
    PathDrawable icon = new PathDrawable(PATH_DROID, getActivity(), 150, 0xAAFFFFFF);
    getView().findViewById(R.id.img_preview).setBackground(icon);

    ((TextView) getView().findViewById(android.R.id.text1)).setText(title);
    ((TextView) getView().findViewById(android.R.id.text2)).setText(msg);
  }
}
