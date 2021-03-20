// Made with Blockbench 3.8.2
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports

public static class Modelreinertitan extends EntityModel<Entity> {
	private final ModelRenderer Head;
	private final ModelRenderer Body;
	private final ModelRenderer RightArm;
	private final ModelRenderer LeftArm;
	private final ModelRenderer RightLeg;
	private final ModelRenderer LeftLeg;

	public Modelreinertitan() {
		textureWidth = 640;
		textureHeight = 640;

		Head = new ModelRenderer(this);
		Head.setRotationPoint(0.0F, -219.0F, 0.0F);
		Head.setTextureOffset(0, 0).addBox(-40.0F, -77.0F, -40.0F, 80.0F, 80.0F, 80.0F, 0.0F, false);
		Head.setTextureOffset(315, 0).addBox(-39.5F, -75.5F, -42.5F, 80.0F, 77.0F, 84.0F, 0.5F, false);

		Body = new ModelRenderer(this);
		Body.setRotationPoint(0.0F, 0.0F, 0.0F);
		Body.setTextureOffset(160, 160).addBox(-40.0F, -216.0F, -20.0F, 80.0F, 120.0F, 40.0F, 0.0F, false);
		Body.setTextureOffset(160, 320).addBox(-33.75F, -219.75F, -22.25F, 76.0F, 126.0F, 46.0F, 0.25F, false);

		RightArm = new ModelRenderer(this);
		RightArm.setRotationPoint(-50.0F, -216.0F, 0.0F);
		RightArm.setTextureOffset(400, 160).addBox(-30.0F, 0.0F, -20.0F, 40.0F, 120.0F, 40.0F, 0.0F, false);
		RightArm.setTextureOffset(459, 475).addBox(-31.75F, -3.75F, -22.25F, 44.0F, 122.0F, 46.0F, 0.25F, false);

		LeftArm = new ModelRenderer(this);
		LeftArm.setRotationPoint(50.0F, -216.0F, 0.0F);
		LeftArm.setTextureOffset(0, 161).addBox(-10.0F, 0.0F, -20.0F, 40.0F, 120.0F, 40.0F, 0.0F, false);
		LeftArm.setTextureOffset(461, 477).addBox(-13.75F, -3.75F, -22.25F, 45.0F, 120.0F, 46.0F, 0.25F, false);

		RightLeg = new ModelRenderer(this);
		RightLeg.setRotationPoint(-18.9F, -98.0F, 0.0F);
		RightLeg.setTextureOffset(320, 481).addBox(-20.1F, 2.0F, -20.0F, 40.0F, 120.0F, 40.0F, 0.0F, false);
		RightLeg.setTextureOffset(459, 471).addBox(-23.85F, -1.75F, -22.25F, 46.0F, 126.0F, 46.0F, 0.25F, false);

		LeftLeg = new ModelRenderer(this);
		LeftLeg.setRotationPoint(19.9F, -98.0F, 0.0F);
		LeftLeg.setTextureOffset(160, 481).addBox(-20.9F, 2.0F, -20.0F, 40.0F, 120.0F, 40.0F, 0.0F, false);
		LeftLeg.setTextureOffset(379, 322).addBox(-24.65F, -1.75F, -22.25F, 46.0F, 126.0F, 46.0F, 0.25F, false);
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