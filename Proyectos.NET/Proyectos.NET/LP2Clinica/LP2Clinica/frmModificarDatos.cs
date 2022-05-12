using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace LP2Clinica
{
    public partial class frmModificarDatos : Form
    {
        PrincipalCliente Principal = null;
        Form Anterior=null;
        
        public frmModificarDatos()
        {
            InitializeComponent();
        }
        public void SetAnterior(Form paginaAnterior)
        {
           Anterior = paginaAnterior;
        }
        public void SetPrincipal(PrincipalCliente paginaPrincipal)
        {
            Principal = paginaPrincipal;
        }
        private void btnModificarContra_Click(object sender, EventArgs e)
        {
            frmModificarContraseña actualizarContraseña = new frmModificarContraseña();
            actualizarContraseña.ShowDialog();
        }

        private void bnCancelar_Click(object sender, EventArgs e)
        {
            if(Anterior!=null)Principal.abrirFormulario(Anterior);
            else this.Close();
        }
        public void limpiarcomponentes() {
            txtContraseña.Text = " ";
            txtEmail.Text = " ";
            txtUsername.Text = " ";
        }
        private void btnConfirmar_Click(object sender, EventArgs e)
        {
            MessageBox.Show("Se ha modificado los datos correctamente", "Mensaje de confirmación", MessageBoxButtons.OK, MessageBoxIcon.Information);
            limpiarcomponentes();
        }
    }
}
