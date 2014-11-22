package mygame;

import com.jme3.app.SimpleApplication;
import com.jme3.light.DirectionalLight;
import com.jme3.material.Material;
import com.jme3.math.ColorRGBA;
import com.jme3.math.Vector3f;
import com.jme3.renderer.RenderManager;
import com.jme3.scene.Geometry;
import com.jme3.scene.Spatial;
import com.jme3.scene.shape.Box;

/**
 * test
 * @author normenhansen
 */
public class LoadModel extends SimpleApplication {

    public static void main(String[] args) {
        LoadModel app = new LoadModel();
        app.start();
    }

    @Override
    public void simpleInitApp() {
        Spatial mymodel = assetManager.loadModel(
      "Textures/MyModel/GumballMachine.obj"); 
  rootNode.attachChild(mymodel);
  DirectionalLight sun = new DirectionalLight();
  sun.setDirection((new Vector3f(-0.5f, -0.5f, -0.5f)));
  sun.setColor(ColorRGBA.White);
  rootNode.addLight(sun); 
}

    @Override
    public void simpleUpdate(float tpf) {
        //TODO: add update code
    }

    @Override
    public void simpleRender(RenderManager rm) {
        //TODO: add render code
    }
}
