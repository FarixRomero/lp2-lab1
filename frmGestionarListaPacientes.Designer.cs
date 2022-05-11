namespace LP2Clinica
{
    partial class frmGestionarListaPacientes
    {
        /// <summary>
        /// Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Clean up any resources being used.
        /// </summary>
        /// <param name="disposing">true if managed resources should be disposed; otherwise, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows Form Designer generated code

        /// <summary>
        /// Required method for Designer support - do not modify
        /// the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            this.pbHome = new System.Windows.Forms.PictureBox();
            ((System.ComponentModel.ISupportInitialize)(this.pbHome)).BeginInit();
            this.SuspendLayout();
            // 
            // pbHome
            // 
            this.pbHome.BackColor = System.Drawing.Color.Transparent;
            this.pbHome.Image = global::LP2Clinica.Properties.Resources.home2_removebg_preview1;
            this.pbHome.Location = new System.Drawing.Point(3, 2);
            this.pbHome.Name = "pbHome";
            this.pbHome.Size = new System.Drawing.Size(90, 88);
            this.pbHome.SizeMode = System.Windows.Forms.PictureBoxSizeMode.StretchImage;
            this.pbHome.TabIndex = 29;
            this.pbHome.TabStop = false;
            // 
            // frmGestionarListaPacientes
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.BackgroundImage = global::LP2Clinica.Properties.Resources.PANTALLA_3;
            this.BackgroundImageLayout = System.Windows.Forms.ImageLayout.Stretch;
            this.ClientSize = new System.Drawing.Size(616, 580);
            this.Controls.Add(this.pbHome);
            this.DoubleBuffered = true;
            this.Name = "frmGestionarListaPacientes";
            this.Text = "Lista de Pacientes";
            ((System.ComponentModel.ISupportInitialize)(this.pbHome)).EndInit();
            this.ResumeLayout(false);

        }

        #endregion

        private System.Windows.Forms.PictureBox pbHome;
    }
}