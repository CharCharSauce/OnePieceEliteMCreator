// Made with Blockbench 3.7.5
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports

public static class ModelWaver extends EntityModel<Entity> {
	private final ModelRenderer Boat;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer Wake;

	public ModelWaver() {
		textureWidth = 128;
		textureHeight = 128;

		Boat = new ModelRenderer(this);
		Boat.setRotationPoint(0.0F, 24.0F, 0.0F);
		Boat.setTextureOffset(0, 0).addBox(-2.5F, -2.0F, -7.0F, 5.0F, 1.0F, 17.0F, 0.0F, false);
		Boat.setTextureOffset(0, 43).addBox(-0.5F, -27.0F, 12.0F, 1.0F, 23.0F, 1.0F, 0.0F, false);
		Boat.setTextureOffset(40, 25).addBox(-7.5F, -25.0F, 12.0F, 15.0F, 1.0F, 1.0F, 0.0F, false);
		Boat.setTextureOffset(0, 36).addBox(-7.5F, -24.0F, 11.0F, 15.0F, 6.0F, 1.0F, 0.0F, false);
		Boat.setTextureOffset(0, 18).addBox(-1.5F, -1.0F, -7.0F, 3.0F, 1.0F, 17.0F, 0.0F, false);
		Boat.setTextureOffset(41, 0).addBox(-2.0F, -4.0F, 10.0F, 4.0F, 4.0F, 6.0F, 0.5F, false);
		Boat.setTextureOffset(0, 18).addBox(-2.0F, -4.5F, 16.0F, 4.0F, 4.0F, 2.0F, 1.0F, false);
		Boat.setTextureOffset(0, 2).addBox(3.0F, -2.5F, 12.0F, 1.0F, 1.0F, 1.0F, 1.0F, false);
		Boat.setTextureOffset(0, 0).addBox(-4.0F, -2.5F, 12.0F, 1.0F, 1.0F, 1.0F, 1.0F, false);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(0.0F, -3.0F, -17.0F);
		Boat.addChild(cube_r1);
		setRotationAngle(cube_r1, -0.3054F, 0.0F, 0.0F);
		cube_r1.setTextureOffset(0, 0).addBox(-0.5F, -1.0F, -7.0F, 1.0F, 1.0F, 7.0F, 0.4F, false);

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(0.0F, -3.0F, -17.0F);
		Boat.addChild(cube_r2);
		setRotationAngle(cube_r2, -0.3927F, 0.0F, 0.0F);
		cube_r2.setTextureOffset(0, 8).addBox(-0.5F, -0.3F, -6.0F, 1.0F, 1.0F, 6.0F, 0.2F, false);

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(0.0F, -1.0F, -7.0F);
		Boat.addChild(cube_r3);
		setRotationAngle(cube_r3, -0.1745F, 0.0F, 0.0F);
		cube_r3.setTextureOffset(23, 23).addBox(-1.5F, -1.0F, -11.0F, 3.0F, 1.0F, 11.0F, 0.3F, false);

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(0.0F, -1.0F, -7.0F);
		Boat.addChild(cube_r4);
		setRotationAngle(cube_r4, -0.2182F, 0.0F, 0.0F);
		cube_r4.setTextureOffset(40, 13).addBox(-0.5F, 0.0F, -11.0F, 1.0F, 1.0F, 11.0F, 0.0F, false);

		Wake = new ModelRenderer(this);
		Wake.setRotationPoint(0.0F, 24.0F, 19.0F);
		Wake.setTextureOffset(28, 35).addBox(-5.0F, -1.0F, 4.0F, 1.0F, 1.0F, 12.0F, 0.0F, false);
		Wake.setTextureOffset(27, 0).addBox(4.0F, -1.0F, 4.0F, 1.0F, 1.0F, 12.0F, 0.0F, false);
		Wake.setTextureOffset(23, 18).addBox(-4.0F, -1.0F, 0.0F, 1.0F, 1.0F, 4.0F, 0.0F, false);
		Wake.setTextureOffset(23, 23).addBox(3.0F, -1.0F, 0.0F, 1.0F, 1.0F, 4.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		Boat.render(matrixStack, buffer, packedLight, packedOverlay);
		Wake.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
	}
}