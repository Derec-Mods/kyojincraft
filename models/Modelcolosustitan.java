// Made with Blockbench 3.8.2
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports

public static class Modelcolosustitan extends EntityModel<Entity> {
	private final ModelRenderer Head;
	private final ModelRenderer Body;
	private final ModelRenderer RightArm;
	private final ModelRenderer LeftArm;
	private final ModelRenderer RightLeg;
	private final ModelRenderer LeftLeg;

	public Modelcolosustitan() {
		textureWidth = 2240;
		textureHeight = 2240;

		Head = new ModelRenderer(this);
		Head.setRotationPoint(0.0F, -782.0F, 0.0F);
		Head.setTextureOffset(20, 0).addBox(-132.88F, -266.72F, -133.12F, 266.0F, 266.0F, 266.0F, 0.0F, false);
		Head.setTextureOffset(1122, 0).addBox(-137.22F, -271.06F, -136.78F, 274.0F, 274.0F, 274.0F, 0.5F, false);

		Body = new ModelRenderer(this);
		Body.setRotationPoint(0.0F, 0.0F, 0.0F);
		Body.setTextureOffset(595, 565).addBox(-132.88F, -774.36F, -66.56F, 266.0F, 399.0F, 133.0F, 0.0F, false);
		Body.setTextureOffset(557, 1121).addBox(-130.98F, -772.46F, -68.14F, 274.0F, 407.0F, 140.0F, 0.5F, false);

		RightArm = new ModelRenderer(this);
		RightArm.setRotationPoint(-121.0F, -765.0F, 13.0F);
		RightArm.setTextureOffset(735, 438).addBox(-106.12F, -9.36F, -43.56F, 94.0F, 618.0F, 97.0F, 0.0F, false);
		RightArm.setTextureOffset(0, 1386).addBox(-113.05F, 426.71F, -45.63F, 109.0F, 185.0F, 107.0F, 0.25F, false);

		LeftArm = new ModelRenderer(this);
		LeftArm.setRotationPoint(122.0F, -766.0F, 18.0F);
		LeftArm.setTextureOffset(0, 390).addBox(9.24F, -8.36F, -48.56F, 94.0F, 618.0F, 97.0F, 0.0F, false);
		LeftArm.setTextureOffset(0, 1350).addBox(10.82F, 427.64F, -54.56F, 100.0F, 182.0F, 106.0F, 0.5F, false);

		RightLeg = new ModelRenderer(this);
		RightLeg.setRotationPoint(-73.9F, -376.0F, 0.0F);
		RightLeg.setTextureOffset(556, 1720).addBox(-55.772F, 1.0F, -66.56F, 133.0F, 399.0F, 133.0F, 0.0F, false);
		RightLeg.setTextureOffset(1700, 1710).addBox(-61.022F, 4.07F, -70.47F, 138.0F, 404.0F, 138.0F, 0.25F, false);

		LeftLeg = new ModelRenderer(this);
		LeftLeg.setRotationPoint(75.9F, -376.0F, 0.0F);
		LeftLeg.setTextureOffset(1066, 1720).addBox(-79.108F, 1.0F, -66.56F, 133.0F, 399.0F, 133.0F, 0.0F, false);
		LeftLeg.setTextureOffset(1363, 1125).addBox(-76.038F, 4.07F, -68.39F, 138.0F, 404.0F, 138.0F, 0.25F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		Head.render(matrixStack, buffer, packedLight, packedOverlay);
		Body.render(matrixStack, buffer, packedLight, packedOverlay);
		RightArm.render(matrixStack, buffer, packedLight, packedOverlay);
		LeftArm.render(matrixStack, buffer, packedLight, packedOverlay);
		RightLeg.render(matrixStack, buffer, packedLight, packedOverlay);
		LeftLeg.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
		this.RightArm.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
		this.LeftLeg.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		this.Head.rotateAngleY = f3 / (180F / (float) Math.PI);
		this.Head.rotateAngleX = f4 / (180F / (float) Math.PI);
		this.LeftArm.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
		this.RightLeg.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
	}
}